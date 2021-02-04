package xyz.teamgravity.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {

    private lateinit var resourceCompare: ResourceCompare

    @Before
    fun setUp() {
        resourceCompare = ResourceCompare()
    }

    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsGivenString_true() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "Unit Test")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceNotSameAsGivenString_false() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "UnitTest")
        assertThat(result).isFalse()
    }
}