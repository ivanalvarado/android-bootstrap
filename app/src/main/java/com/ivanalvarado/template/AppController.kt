package com.ivanalvarado.template

import android.app.Activity
import android.app.Application
import com.ivanalvarado.template.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


/*
 * we use our AppComponent (now prefixed with Dagger)
 * to inject our Application class.
 * This way a DispatchingAndroidInjector is injected which is
 * then returned when an injector for an activity is requested.
 * */
@HiltAndroidApp
class AppController : Application() {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }
}