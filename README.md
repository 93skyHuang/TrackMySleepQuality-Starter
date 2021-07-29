TrackMySleepQuality - Starter Code
TrackMySleepQuality is an app for recording sleep data for each night. 
You can record a start and stop time, assign a quality rating, and clear the database. 

In this codelab, working from this starter app,
you will implement the Room database that holds the sleep data. 
You will then use instrumented tests to verify that this backend works. 

1、Room数据库的使用，需要一个注解为Dao的接口类、数据实体类@Entity 、创建数据库实例继承RoomDatabase
2、伴生对象 companion object 、创建线程安全的实例化对象
3、RecycleView 的使用，RecycleView 只是一个容器，通过Adapter提供子视图以及更新子视图
4、ViewHolder中可以提供一些方法让每个item刷新，则不需要在onBindViewHolder中去通过holder去调用某个view
同事创建viewHolder也可以在ViewHolder类中提供创建方法
5、携程的使用，携程与Room数据库的使用。
6、DiffUtil 用于RecycleView中，可用于比较2个列表的不同。通过DiffUtil 的ItemCallback可以自行去处理比较逻辑
7、ListAdapter 可替代RecycleView.Adapter实现recycleView所需的Adapter
8、DataBinding 与RecycleView的使用 @BindingAdapter 使用扩展函数 注解实现item中某个view所需要执行的行为比如textView的text属性的方法
@BindingAdapter("sleepDurationFormatted")
fun TextView.setSleepDurationFormatted(item: SleepNight) {
    text = convertDurationToFormatted(item.startTimeMilli, item.endTimeMilli, context.resources)
}
在xml中的指定view引入 app:sleepDurationFormatted="@{sleep}"