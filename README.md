TrackMySleepQuality - Starter Code
TrackMySleepQuality is an app for recording sleep data for each night. 
You can record a start and stop time, assign a quality rating, and clear the database. 

In this codelab, working from this starter app,
you will implement the Room database that holds the sleep data. 
You will then use instrumented tests to verify that this backend works. 

1、Room数据库的使用，需要一个注解为Dao的接口类、数据实体类@Entity 、创建数据库实例继承RoomDatabase
2、伴生对象 companion object 、结合synchronized、Volatile创建线程安全的单列对象
3、RecycleView 的使用，RecycleView 只是一个容器，通过Adapter提供子视图以及更新子视图
4、ViewHolder中可以提供一些方法让每个item刷新，则不需要在onBindViewHolder中去通过holder去调用某个view
同事创建viewHolder也可以在ViewHolder类中提供创建方法
5、携程的使用，携程与Room数据库的使用。
6、DiffUtil 用于RecycleView中，可用于比较2个列表的不同。通过DiffUtil 的ItemCallback可以自行去处理比较逻辑
7、ListAdapter 可替代RecycleView.Adapter实现recycleView所需的Adapter
8、DataBinding 与RecycleView的使用 @BindingAdapter注解函数在函数中实现item中某个view所需要执行的行为比如textView的text属性的方法
@BindingAdapter("sleepDurationFormatted")
fun TextView.setSleepDurationFormatted(item: SleepNight) {
    text = convertDurationToFormatted(item.startTimeMilli, item.endTimeMilli, context.resources)
}
在xml中的指定view引入 app:sleepDurationFormatted="@{sleep}"
9、DataBinding 的作用主要是起与ViewModel中的数据进行绑定，同时初始化布局，有点类似于setContentView(@layout int resId)
10、DataBinding 的初始化都是在每个view的初始化布局中去实列化DataBinding
activity 中：val bind:FragmentSleepTrackerBinding =DataBindingUtil
.setContentView(this,R.layout.fragment_sleep_tracker)
fragment 中：val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(
                           inflater, R.layout.fragment_sleep_tracker, container, false)
   同时使用binding.root 返回绑定好了的根布局
adapter 中：  val bind = ListItemSleepTrackerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
11、RecycleView Adapter类的实现
需要继承RecycleView的Adapter 或者使用ListAdapter+DiffUtil 的方式来加载数据和更新数据
Adapter 中需要实现的2个方法onCreateViewHolder() 填充item布局 onBindViewHolder() 实现布局与数据的绑定
构建继承RecycleView ViewHolder的ViewHolder类 并提供给Adapter中onCreateViewHolder使用
ViewHolder类主要是将item布局View告诉RecycleView.在这个类中初始化构建item中的View

12、DataBinding 使用DataBindingUtil.inflate构造出需要对应的layout
，帮定页面生命周期或者executePendingBindings()
，在绑定这个DataBinding需要的data，如果需要灵活使用