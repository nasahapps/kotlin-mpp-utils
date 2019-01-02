package utils

import kotlinx.coroutines.CoroutineDispatcher

expect val UI: CoroutineDispatcher
expect val IO: CoroutineDispatcher