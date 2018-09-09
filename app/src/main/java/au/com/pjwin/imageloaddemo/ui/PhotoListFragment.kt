package au.com.pjwin.imageloaddemo.ui

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import android.view.inputmethod.EditorInfo
import au.com.pjwin.commonlib.ui.BaseFragment
import au.com.pjwin.commonlib.util.Util
import au.com.pjwin.imageloaddemo.R
import au.com.pjwin.imageloaddemo.databinding.FragmentMainBinding
import au.com.pjwin.imageloaddemo.model.PhotoResponse
import au.com.pjwin.imageloaddemo.viewmodel.PhotoViewModel

const val COLUMNS = 3

class PhotoListFragment : BaseFragment<PhotoResponse, PhotoViewModel, FragmentMainBinding>() {

    companion object {
        fun newInstance() = PhotoListFragment()
    }

    override fun layoutId() = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridLayoutManager = GridLayoutManager(Util.context(), COLUMNS)

        binding.apply {
            photoList.apply {
                setHasFixedSize(true)
                layoutManager = gridLayoutManager
            }

            buttonSearch.setOnClickListener {
                searchPhotos()
            }

            searchInput.setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    searchPhotos()
                    true
                } else {
                    false
                }
            }
        }
    }

    override fun onData(data: PhotoResponse?) {
        data?.let {
            binding.photoList.adapter = PhotoAdapter(context!!, it)//onData should not be called when the fragment is killed
        }
    }

    private fun searchPhotos() {
        if (!binding.searchInput.text.isEmpty()) {
            viewModel.searchPhotos(binding.searchInput.text.toString())
        }
    }
}