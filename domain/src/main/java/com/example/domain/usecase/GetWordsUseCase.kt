package com.example.domain.usecase

import com.example.domain.repository.ProductRepository

class GetWordsUseCase(private val productRepository: ProductRepository) {

    suspend fun execute() = productRepository.getWords()
}