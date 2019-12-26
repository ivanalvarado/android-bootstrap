package com.ivanalvarado.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ivanalvarado.template.viewmodel.ExampleViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /*
     * Step 1: Here as mentioned in Step 5, we need to
     * inject the ViewModelFactory. The ViewModelFactory class
     * has a list of ViewModels and will provide
     * the corresponding ViewModel in this activity
     * */
    @Inject
    internal lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var exampleViewModel: ExampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        /*
         * Step 2: Remember in our ActivityModule, we
         * defined MainActivity injection? So we need
         * to call this method in order to inject the
         * ViewModelFactory into our Activity
         * */
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewModel()
    }

    private fun setUpViewModel() {
        exampleViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(ExampleViewModel::class.java)
    }
}
