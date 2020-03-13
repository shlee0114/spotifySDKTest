package com.example.spotify

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.DecorContentParent
import androidx.core.graphics.drawable.DrawableCompat
import com.example.spotify.MainActivity.AuthParams.CLIENT_ID
import com.example.spotify.MainActivity.AuthParams.REDIRECT_URI
import com.google.gson.GsonBuilder
import com.spotify.android.appremote.api.SpotifyAppRemote
import com.spotify.android.appremote.api.ConnectionParams
import com.spotify.android.appremote.api.Connector
import com.spotify.protocol.client.Subscription
import com.spotify.protocol.types.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.coroutines.Continuation
import kotlin.coroutines.suspendCoroutine

@SuppressLint("Registered")
@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {

    object AuthParams{
        val CLIENT_ID =  "0cc0574d6d3045239ebadf2f9ee20ff9"
        val REDIRECT_URI = "http://hannam.shop:7777/callback"
    }

    object SpotifySampleContexts{
        const val TRACK_URI = "spotify:track:4IWZsfEkaK49itBwCTFDXQ"
        const val ALBUM_URI = "spotify:album:4m2880jivSbbyEGAKfITCa"
        const val ARTIST_URI = "spotify:artist:3WrFJ7ztbogyGnTHbHJFl2"
        const val PLAYLIST_URI = "spotify:playlist:37i9dQZEVXbMDoHDwVN2tF"
        const val PODCAST_URI = "spotify:show:2tgPYIeGErjk6irHRhk9kj"
    }

    companion object{
        const val TAG = "App-Remote Sample"
        const val STEP_MS = 15000L
    }

    private val gson = GsonBuilder().setPrettyPrinting().create()

    private var playerStateSubscription: Subscription<PlayerState>? = null
    private var playerContextSubscription: Subscription<PlayerContext>? = null
    private var capabilitiesSubscription: Subscription<Capabilities>? = null
    private var spotifyAppRemote: SpotifyAppRemote? = null

    private lateinit var views: List<View>
    //private lateinit var trackProgressBar: TrackProgressBar

    private val errorCallback = { throwable: Throwable -> logError(throwable)}

    private val playerContextEventCallback = Subscription.EventCallback<PlayerContext> { playerContext ->
        current_context_label.apply {
            text = String.format(Locale.US, "%s\n%s", playerContext.title, playerContext.subtitle)
            tag = playerContext
        }
    }

    private val ContextEventCallback = Subscription.EventCallback<PlayerState>{playerState ->
        Log.v(TAG, String.format("Player State: %s", gson.toJson(playerState)))
    }

    private fun updatePlayPauseButton(playerState: PlayerState){

    }

    private fun updateTrackStateButton(playerState: PlayerState){

    }

    private fun updateRShuffleButton(playerState: PlayerState){

    }

    private fun updateRepeatButton(playerState: PlayerState){

    }

    private fun AppCompatImageButton.setTint(@ColorInt tint: Int){
        DrawableCompat.setTint(drawable, Color.WHITE)
    }

    private fun updateSeekbar(playerState: PlayerState){

    }

    private fun updatePlaybackSpeed(playerState: PlayerState){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun seekTo(seekToPosition: Long){

    }

    override fun onStop() {
        super.onStop()
    }

    private fun onConnected(){

    }

    private fun onConnecting(){

    }

    private fun onDisconnected(){

    }

    fun onConnectClicked(notUsed: View){

    }

    fun onConnectAndAuthorizedClicked(notUsed: View){

    }

    private fun connect(showAuthView: Boolean){

    }

    private suspend fun connectToAppRemote(): SpotifyAppRemote? =
        suspendCoroutine { cont: Continuation<SpotifyAppRemote>->

        }

    fun onDisconnectClicked(notUsed: View){

    }

    fun onImageClicked(view: View){

    }

    fun onImageScaleTypeClicked(view: View){

    }

    fun onPlayPodcastButtonClicked(notUsed: View){

    }

    fun onPlayTrackButtonClicked(notUsed: View){

    }

    fun onPlayAlbumButtonClicked(notUsed: View){

    }

    fun onPlayArtistButtonClicked(notUsed: View){

    }

    fun onPlayPlaylistButtonClicked(notUsed: View){

    }

    private fun playUri(uri: String){

    }

    fun showCurrentPlayerContext(view: View){

    }

    fun showCurrentPlayerState(view: View){

    }

    fun onToggleShuffleButtonClicked(notUsed: View){

    }

    fun onToggleRepeatButtonClicked(notUsed: View){

    }

    fun onSkipPreviousButtonClicked(notUsed: View){

    }

    fun onPlayPauseButtonClicked(notUsed: View){

    }

    fun onSkipNextButtonClicked(notUsed: View){

    }

    fun onSeekBack(notUsed: View){

    }

    fun onSeekForward(notUsed: View){

    }

    fun onSubscribeToCapabilitiesClicked(notUsed: View){

    }

    fun onGetCollectionStateClicked(notUsed: View){

    }

    fun onRemoveUriClicked(notUsed: View){

    }

    fun onSaveUriClicked(notUsed: View){

    }

    fun onGetFitnessRecommendedContentItemsClicked(notUsed: View){

    }

    private fun convertToList(inputItems: ListItems?): List<ListItem>{

    }

    private suspend fun loadRootrecommendations(appRemote: SpotifyAppRemote): ListItems? =
        suspendCoroutine {cont ->

        }

    private suspend fun loadChildren(appRemote: SpotifyAppRemote, parent: ListItem): ListItems? =
        suspendCoroutine { cont ->

        }
    fun onConnectSwitchToLocalClicked(notUsed: View){

    }

    fun onSubscribedToPlayerContextButtonClicked(notUsed: View){

    }

    fun onPlaybackSpeedButtonClicked(view: View){

    }

    private fun <T : Any?> cancelAndResetSubscription(subscription: Subscription<T>?): Subscription<T>?{

    }

    private fun assertAppRemoteConnected(): SpotifyAppRemote{

    }

    private fun logError(throwable: Throwable){

    }

    private fun logMessage(msg: String, duration: Int = Toast.LENGTH_SHORT){

    }

    private fun showDialog(title: String, message: String){

    }
}
