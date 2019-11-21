package com.woocommerce.android.ui.login

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MagicLinkInterceptModule {
    @ContributesAndroidInjector
    internal abstract fun magicLinkInterceptFragment(): MagicLinkInterceptFragment
}