package eu.artistdemoapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by srshe on 05-July-2021
 */
class Album {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("link")
    @Expose
    var link: String? = null

    @SerializedName("cover")
    @Expose
    var cover: String? = null

    @SerializedName("cover_small")
    @Expose
    var coverSmall: String? = null

    @SerializedName("cover_medium")
    @Expose
    var coverMedium: String? = null

    @SerializedName("cover_big")
    @Expose
    var coverBig: String? = null

    @SerializedName("cover_xl")
    @Expose
    var coverXl: String? = null

    @SerializedName("md5_image")
    @Expose
    var md5Image: String? = null

    @SerializedName("genre_id")
    @Expose
    var genreId: Int? = null

    @SerializedName("fans")
    @Expose
    var fans: Int? = null

    @SerializedName("release_date")
    @Expose
    var releaseDate: String? = null

    @SerializedName("record_type")
    @Expose
    var recordType: String? = null

    @SerializedName("tracklist")
    @Expose
    var tracklist: String? = null

    @SerializedName("explicit_lyrics")
    @Expose
    var explicitLyrics: Boolean? = null

    @SerializedName("type")
    @Expose
    var type: String? = null
}