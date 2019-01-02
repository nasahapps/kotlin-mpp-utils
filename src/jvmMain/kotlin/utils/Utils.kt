package utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val UI: CoroutineDispatcher = Dispatchers.Main
actual val IO: CoroutineDispatcher = Dispatchers.IO