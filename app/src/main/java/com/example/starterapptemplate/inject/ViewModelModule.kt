package com.example.starterapptemplate.inject

import com.example.starterapptemplate.viewmodel.MainViewModel
import com.example.starterapptemplate.viewmodel.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun providesMainViewModel(): MainViewModel {
        return MainViewModelFactory().create()
    }
}