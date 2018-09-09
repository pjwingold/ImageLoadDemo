package au.com.pjwin.imageloaddemo.viewmodel

import au.com.pjwin.commonlib.viewmodel.retrofit.RetrofitDataViewModel
import au.com.pjwin.imageloaddemo.BuildConfig
import au.com.pjwin.imageloaddemo.model.PhotoResponse
import au.com.pjwin.imageloaddemo.repo.retrofit.AppRepo

open class PhotoViewModel : RetrofitDataViewModel<PhotoResponse>() {

    //val searchTextData = MutableLiveData<String>()

    fun searchPhotos(searchText: String) {
        enqueue(AppRepo.photoService().searchPhotos(BuildConfig.FLICKR_API_KEY, searchText), this::onData)
    }
}