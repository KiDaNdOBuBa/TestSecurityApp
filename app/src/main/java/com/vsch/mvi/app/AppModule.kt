package com.vsch.mvi.app

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    companion object {
//        @Provides
//        fun provideRealmDefaultConfiguration(): Unit {
//
//        }
    }
}
