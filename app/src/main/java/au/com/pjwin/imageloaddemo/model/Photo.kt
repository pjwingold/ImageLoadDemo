package au.com.pjwin.imageloaddemo.model

import com.google.gson.annotations.SerializedName

data class Photo(
        var id: String,
        var owner: String,
        var secret: String,
        var server: String,
        var farm: Int,
        var title: String,
        @SerializedName("ispublic") var isPublic: Short,
        @SerializedName("isfriend") var isFriend: Short,
        @SerializedName("isfamily") var isFamily: Short
)