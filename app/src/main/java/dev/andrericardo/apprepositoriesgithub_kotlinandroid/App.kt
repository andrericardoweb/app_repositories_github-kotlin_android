package dev.andrericardo.apprepositoriesgithub_kotlinandroid

import android.app.Application
import dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.di.DataModule
import dev.andrericardo.apprepositoriesgithub_kotlinandroid.domain.di.DomainModule
import dev.andrericardo.apprepositoriesgithub_kotlinandroid.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}