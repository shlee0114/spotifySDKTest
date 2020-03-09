package com.example.spotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.spotify.android.appremote.api.SpotifyAppRemote
import com.spotify.android.appremote.api.ConnectionParams
import com.spotify.android.appremote.api.Connector
import com.spotify.protocol.types.Track
import java.util.*

class MainActivity : AppCompatActivity() {

    val CLIENT_ID =  "0cc0574d6d3045239ebadf2f9ee20ff9"
    val REDIRECT_URI = "http://hannam.shop:7777/callback"
    var mSpotifyAppRemote : SpotifyAppRemote? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val connectionParams = ConnectionParams.Builder(CLIENT_ID)
            .setRedirectUri(REDIRECT_URI)
            .showAuthView(true)
            .build()
        SpotifyAppRemote.connect(this, connectionParams, object : Connector.ConnectionListener{
            override fun onConnected(p0: SpotifyAppRemote?) {
                mSpotifyAppRemote = p0
                Log.d("MainActivity", "Connected! Yay!")
                connected()
            }

            override fun onFailure(p0: Throwable?) {

            }
        })
    }

    override fun onStop() {
        super.onStop()
        SpotifyAppRemote.disconnect(mSpotifyAppRemote)
    }

    private fun connected(){
        mSpotifyAppRemote!!.playerApi.play("spotify:playlist:37i9dQZF1DX2sUQwD7tbmL")

        mSpotifyAppRemote!!.playerApi
            .subscribeToPlayerState()
            .setEventCallback({
                val track : Track = it.track
                if(track != null){

                }
            })
    }
}
