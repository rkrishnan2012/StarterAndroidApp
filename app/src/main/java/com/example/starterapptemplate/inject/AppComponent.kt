package com.example.starterapptemplate.inject

import com.example.starterapptemplate.StarterApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
        ActivityModule::class,
        AndroidInjectionModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        AppModule::class])
interface StarterAppComponent: AndroidInjector<StarterApplication> {
}
