package com.proyectoArgProg.myapplication


import androidx.arch.core.executor.testing.InstantTaskExecutorRule

import com.proyectoArgProg.myapplication.MVVM.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelUnitTest {

    private lateinit var viewModel : MainViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    @OptIn(ExperimentalCoroutinesApi::class)
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }
    @Test
    fun checkInitialValueResultado () = runTest {
   var value = viewModel.resultado.value
        assertNull(value)

}
}


/*La verdad, no entendí como hacer tests, y me cuesta mucho entender cómo aplicarlos. Solo hice uno similar al visto en el Laboratorio para comprobar si el valor inicial es nulo.
Pero no entiendo cómo implementar otros tests, como por ej testear mi funcion compareStrings del viewModel. Si pudiese tener una correccion o consejo al respecto me ayudaría, gracias!*/