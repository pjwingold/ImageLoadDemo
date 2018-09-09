package au.com.pjwin.imageloaddemo.ui

import android.content.Context
import au.com.pjwin.commonlib.ui.adapter.RecyclerListAdapter
import au.com.pjwin.commonlib.ui.adapter.RecyclerViewHolder
import au.com.pjwin.imageloaddemo.R
import au.com.pjwin.imageloaddemo.databinding.PhotoItemBinding
import au.com.pjwin.imageloaddemo.model.Photo
import au.com.pjwin.imageloaddemo.model.PhotoResponse
import com.bumptech.glide.Glide

const val IMAGE_URL_FORMAT = "http://farm%s.static.flickr.com/%s/%s_%s.jpg"

class PhotoAdapter(private val context: Context, photoResponse: PhotoResponse) :
        RecyclerListAdapter<Photo, PhotoItemBinding, RecyclerViewHolder>(context, photoResponse.photos?.photo) {

    override fun layoutId() = R.layout.photo_item

    override fun bindData(binding: PhotoItemBinding, data: Photo) {
        val url = String.format(IMAGE_URL_FORMAT, data.farm, data.server, data.id, data.secret)
        Glide.with(context)
                .load(url)
                .into(binding.photo)
    }
}