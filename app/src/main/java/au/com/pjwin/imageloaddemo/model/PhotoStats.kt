package au.com.pjwin.imageloaddemo.model

class PhotoStats(var page: Int,
                 var pages: Int,
                 var perpage: Int,
                 var total: Int,
                 var photo: List<Photo>)