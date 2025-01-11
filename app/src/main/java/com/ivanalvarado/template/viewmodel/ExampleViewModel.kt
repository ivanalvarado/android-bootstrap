package com.ivanalvarado.template.viewmodel

import androidx.lifecycle.ViewModel
import com.ivanalvarado.template.repository.ExampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(private val exampleRepository: ExampleRepository) :
    ViewModel() {

    init {

    }


}