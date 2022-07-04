package com.jason.s6

//Kotlin語言的抽象類學習
fun main() {
    val mainActivity = MainActivity()
    mainActivity.onCreate()
}

abstract class BaseActivity {
    fun onCreate() {
        setContentView(getLayoutId())

        initView()
        initData()
        initXxx()
    }

    private fun setContentView(layoutId: Int) = println("加載${layoutId}佈局xml中")

    abstract fun getLayoutId(): Int
    abstract fun initView()
    abstract fun initData()
    abstract fun initXxx()
}

class MainActivity: BaseActivity() {
    override fun getLayoutId() = 564

    override fun initView() = println("做具體初始化View的實現")

    override fun initData() = println("做具體初始化數據的實現")

    override fun initXxx() = println("做具體初始化xxx的實現")
}