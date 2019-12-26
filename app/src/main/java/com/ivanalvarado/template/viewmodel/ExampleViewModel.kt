package com.ivanalvarado.template.viewmodel

import androidx.lifecycle.ViewModel
import com.ivanalvarado.template.repository.ExampleRepository
import javax.inject.Inject

class ExampleViewModel @Inject constructor(private val exampleRepository: ExampleRepository) :
    ViewModel() {

    init {

    }


}