package com.proto.image.bigimageproto

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(ViewOption.SAMPLED_IMAGE_VIEW)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.image_fragments_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.sampledImageItem -> {
                loadFragment(ViewOption.SAMPLED_IMAGE_VIEW)
                true
            }
            R.id.rawImageItem -> {
                loadFragment(ViewOption.IMAGE_VIEW)
                true
            }
            R.id.photoViewItem -> {
                loadFragment(ViewOption.PHOTO_VIEW)
                true
            }
            R.id.tileViewItem -> {
                loadFragment(ViewOption.TILE_VIEW)
                true
            }
            else -> false
        }

    private fun loadFragment(viewOption: ViewOption) {

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val fragment = when (viewOption) {
            ViewOption.SAMPLED_IMAGE_VIEW -> SampledImageViewFragment()
            ViewOption.IMAGE_VIEW -> ImageViewFragment()
            ViewOption.PHOTO_VIEW -> PhotoViewFragment()
            ViewOption.TILE_VIEW -> TileViewFragment()
        }

        fragmentTransaction.replace(R.id.fragment, fragment)
        fragmentTransaction.commit()
    }

    enum class ViewOption {
        SAMPLED_IMAGE_VIEW, IMAGE_VIEW, PHOTO_VIEW, TILE_VIEW
    }
}
