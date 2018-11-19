package com.proto.image.bigimageproto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_image_view.*


class SampledImageViewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_image_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.post {
            imageView.apply {
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