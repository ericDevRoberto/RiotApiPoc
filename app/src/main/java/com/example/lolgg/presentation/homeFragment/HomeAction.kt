package com.example.lolgg.presentation.homeFragment

import com.example.lolgg.model.SummonerApiProprety

sealed class HomeAction {

    data class Success(val data: SummonerApiProprety?) : HomeAction()
    object NotFound : HomeAction()
    object DeveloperProblem : HomeAction()
    object InternetProblem : HomeAction()
}