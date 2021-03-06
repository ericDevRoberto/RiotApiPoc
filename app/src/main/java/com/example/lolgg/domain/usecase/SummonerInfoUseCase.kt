package com.example.lolgg.domain.usecase

import com.example.lolgg.domain.models.UserModel
import com.example.lolgg.domain.models.UserResponseErrorHandle
import com.example.lolgg.domain.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SummonerInfoUseCase(private val userRepository: UserRepository) {

    suspend operator fun invoke(name: String) : UserModel{
        return withContext(Dispatchers.IO){
            if(name.isEmpty()) throw UserResponseErrorHandle.EmptyEditText
            else userRepository.getSummonerTest(name)
        }
    }
}