package com.example.starterapptemplate.inject

import com.example.starterapptemplate.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module abstract class ActivityModule {
  @ContributesAndroidInjector
  abstract fun mainActivity(): MainActivity
}
