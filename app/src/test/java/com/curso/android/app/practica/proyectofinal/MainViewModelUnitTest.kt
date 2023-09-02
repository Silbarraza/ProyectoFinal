package com.curso.android.app.practica.proyectofinal

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Test
import com.curso.android.app.practica.proyectofinal.view.MainViewModel

import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)

class MainViewModelUnitTest {
   private lateinit var viewModel:MainViewModel

   @get:Rule
   val instantTaskRule = InstantTaskExecutorRule()
   private val dispatcher = StandardTestDispatcher()

   @Before
   fun setup() {
      Dispatchers.setMain(dispatcher)
      viewModel = MainViewModel()
   }

   @After
   fun tearDown() {
      Dispatchers.resetMain()
   }

   @Test
   fun mainViewModel_CheckInitialValue ()= runTest {

      val value = viewModel.compara.value?.mensajeInicial
      assertEquals("Para comparar presiona el botón",value)
   }

}