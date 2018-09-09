package au.com.pjwin.imageloaddemo.repo.retrofit

import au.com.pjwin.commonlib.repo.retrofit.RetrofitRepo

object AppRepo {
    fun photoService(): PhotoService = RetrofitRepo.RETROFIT_OPEN_AUTH.create(PhotoService::class.java)
}