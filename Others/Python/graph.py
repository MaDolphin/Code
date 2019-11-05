# import matplotlib.pyplot as plt
# plt.rcParams['font.sans-serif']=['SimHei']#设置字体以便支持中文
# import numpy as np

# x=np.arange(5)#柱状图在横坐标上的位置
# #列出你要显示的数据，数据的列表长度与x长度相同
# y1=[1,3,5,4,2]
# y2=[2,5,3,1,6]
# y3=[2,5,2,1,3]
# y4=[2,1,3,1,6]
# y5=[7,5,3,1,6]

# bar_width=0.1#设置柱状图的宽度
# tick_label=['A','B','C','D','E']

# #绘制并列柱状图
# plt.bar(x,y1,bar_width,color='salmon',label='类别A')
# plt.bar(x+bar_width,y2,bar_width,color='r',label='类别B')
# plt.bar(x+2*bar_width,y3,bar_width,color='g',label='类别c')
# plt.bar(x+3*bar_width,y4,bar_width,color='b',label='类别D')
# plt.bar(x+4*bar_width,y5,bar_width,color='orange',label='类别E')

# plt.legend()#显示图例，即label
# plt.xticks(x+4*bar_width/2,tick_label)#显示x坐标轴的标签,即tick_label,调整位置，使其落在两个直方图中间位置
# plt.show()



import matplotlib.pyplot as plt
import numpy as np

# 设置中文字体和负号正常显示
plt.rcParams['font.sans-serif'] = ['SimHei']
plt.rcParams['axes.unicode_minus'] = False

plt.figure(figsize=(12,6)) #建立图形
name = ['%d月'%x for x in range(1,13)]   #创建月份
value1 = [np.random.randint(10000) for i in range(12)]   #创建随机数字
value1.sort()    #对数字进行排序
value2 = [np.random.randint(10000) for i in range(12)]   #创建随机数字
value2.sort()    #对数字进行排序
x = range(12)

"""
绘制条形图
left:长条形中点横坐标
height:长条形高度
width:长条形宽度，默认值0.8
alpha:透明度
color:颜色
label:标签，为后面设置legend准备
"""
bar1 = plt.bar(left = [i - 0.2 for i in x], height = value1, width = 0.4,
               alpha = 0.8, color = 'r',label = '一部门')                  #第一个图

bar2 = plt.bar([i + 0.2 for i in x],value2,width = 0.4,
               alpha = 0.8,color = 'g',label = '二部门')                   #第二个图

plt.xticks(x,name)      #设置x轴刻度显示值
plt.ylim(0,10500)       #y轴的范围
plt.title('XXX公司')     #标题
plt.xlabel('月份')       #x轴的标签
plt.ylabel('数量')       #y轴的标签
plt.legend()            #设置图例

'''
get_height:获取值
get_x：获取x轴的位置
get_width:获取图形的宽度
text(x,y,s,fontsize,ha,va)
    x,y:表示坐标值上的值
    s:表示说明文字
    fontsize:表示字体大小
    ha：垂直显示方式{'centee':'中心', 'right':'右', 'left':'左'}
    va：水平显示方式{'center':'中心', 'top':'下', 'bottom':'上', 'baseline':'基线'} 
'''

for rect in bar1:
    height = rect.get_height()  #获得bar1的高度
    plt.text(rect.get_x() + rect.get_width() / 2, height+3, str(height), ha="center", va="bottom")
for rect in bar2:
    height = rect.get_height()
    plt.text(rect.get_x() + rect.get_width() / 2, height+3, str(height), ha="center", va="bottom")

plt.show()