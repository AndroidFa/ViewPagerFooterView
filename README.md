# 仿淘宝页面向右滑动加载图文详情

  *一般电商型的App,商品详情页面都会仿照京东天猫来写。
  *ViewPager用来切换商品的图片，但是滑动到最后一个的时候，有一个页面显示继续滑动查看图文详情。
  *这样的实现效果会有点麻烦，因为大家刚开始设计的时候，可能放的都是ImageView。
  *如果用ViewPager+Fragment能实现这样的效果，但是代码改动量过大。
  *我再想既然Listview和RecyclerView都可以添加FooterView，为什么不能给ViewPager添加一个footerView.
  *这样的话，我们就不用在意后面的View想怎样变化。
