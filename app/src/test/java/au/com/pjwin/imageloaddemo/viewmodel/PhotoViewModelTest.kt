package au.com.pjwin.imageloaddemo.viewmodel

import au.com.pjwin.imageloaddemo.BaseTest
import au.com.pjwin.imageloaddemo.model.PhotoResponse
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mockito
import org.mockito.Spy

class PhotoViewModelTest : BaseTest() {

    @Spy
    private lateinit var photoViewModel: PhotoViewModel

    @Captor
    private lateinit var vmCaptor: ArgumentCaptor<PhotoResponse>

    @Before
    override fun setup() {
        super.setup()
    }

    @Test
    fun testSearchPhoto() {
        photoViewModel.searchPhotos("kittens")

        Mockito.verify(photoViewModel).onData(vmCaptor.capture())

        //todo fix assertNotNull(vmCaptor.value) fail
    }
}
