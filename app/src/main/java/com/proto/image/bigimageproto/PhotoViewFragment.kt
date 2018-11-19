package com.proto.image.bigimageproto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_photo_view.*

class PhotoViewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_photo_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.post {
            photoView.apply {
                maximumScale = 50f

                setImageBitmap(
                    decodeSampledBitmapFromResource(
                        resources,
                        R.drawable.tower_bridge,
                        width,
                        0
                    )
                )
            }
        }
    }
}