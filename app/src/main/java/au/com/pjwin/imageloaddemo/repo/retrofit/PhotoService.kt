package au.com.pjwin.imageloaddemo.repo.retrofit

import au.com.pjwin.imageloaddemo.model.PhotoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoService {

    @GET("rest/?method=flickr.photos.search&format=json&nojsoncallback=1")
    fun searchPhotos(@Query("api_key") apiKey: String,
                     @Query("text") searchText: String): Call<PhotoResponse>
}