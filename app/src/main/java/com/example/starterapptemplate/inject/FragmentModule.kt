package com.example.starterapptemplate.inject

import com.example.starterapptemplate.view.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}