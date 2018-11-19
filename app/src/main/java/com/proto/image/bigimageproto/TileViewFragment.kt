package com.proto.image.bigimageproto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qozix.tileview.TileView
import kotlinx.android.synthetic.main.fragment_tile_view.*

class TileViewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tile_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TileView.Builder(tileView)
            .setSize(15287, 7643)
            .defineZoomLevel("tower_bridge/tower-%1\$d_%2\$d.png")
            .addReadyListener {
                it.scrollTo(15287 / 2, 7643 / 2)
            }
            .build()
    }
}