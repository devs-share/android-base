package id.dshare.androidbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.dshare.androidbase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var mBinding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mBinding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(mBinding.root)

    mBinding.tvHello.text = "Halo dunia!"
  }
}