# EditText  [![](https://jitpack.io/v/hacknife/edittext.svg)](https://jitpack.io/#hacknife/edittext)
EditText是基于官方二次开发的控件，它在原有的基础上增加了六个属性，使用起来更加灵活。[English](https://github.com/hacknife/EditText/blob/master/README_ENGLISH.md)
## 使用说明
### 代码示例
```Java
    <com.hacknife.edittext.EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:drawableLeft=""
        app:drawable_height=""
        app:drawable_width=""
        app:drawable_marginLeft=""
          />
```
## 如何配置
将本仓库引入你的项目:
### Step 1. 添加JitPack仓库到Build文件
合并以下代码到项目根目录下的build.gradle文件的repositories尾。[点击查看详情](https://github.com/hacknife/CarouselBanner/blob/master/root_build.gradle.png)
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. 添加依赖   
合并以下代码到需要使用的application Module的dependencies尾。[点击查看详情](https://github.com/hacknife/CarouselBanner/blob/master/application_build.gradle.png)
```Java
	dependencies {
                ...
	        compile 'com.github.hacknife:edittext:v1.0.1'
	}
```
<br><br>
## 感谢浏览
如果你有任何疑问，请加入QQ群，我将竭诚为你解答。欢迎Star和Fork本仓库，当然也欢迎你关注我。
<br>
![Image Text](https://github.com/hacknife/CarouselBanner/blob/master/qq_group.png)
