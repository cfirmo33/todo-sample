package com.sample.todo.ui.taskdetail

import com.airbnb.mvrx.MvRxState
import com.sample.todo.domain.model.Task

data class TaskDetailState(
    val originalTask: Task?,
    val isLoading: Boolean?,
    val taskNotFound: Boolean?
) : MvRxState