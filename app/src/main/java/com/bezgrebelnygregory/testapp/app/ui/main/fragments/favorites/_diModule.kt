package com.bezgrebelnygregory.testapp.app.ui.main.fragments.favorites

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val diModule: Module
    get() = module(override = true) {
        viewModel {
            FavoritesVM(likeRepo = get())
        }
    }