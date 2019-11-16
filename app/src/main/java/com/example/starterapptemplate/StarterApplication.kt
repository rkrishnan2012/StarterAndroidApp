package com.example.starterapptemplate

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.example.starterapptemplate.inject.AppModule
import com.example.starterapptemplate.inject.DaggerStarterAppComponent
import com.example.starterapptemplate.inject.StarterAppComponent
import com.jakewharton.threetenabp.AndroidThreeTen
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

@Suppress("DEPRECATION")
class StarterApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>


    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
      return fragmentInjector
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

    private val component: StarterAppComponent = DaggerStarterAppComponent.builder()
    .appModule(AppModule(this))
    .build()

    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)

        component.inject(this)
    }
}