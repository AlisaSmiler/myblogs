
alisa@alisa-virtual-machine:~$ sudo docker -v
Docker version 1.13.1, build 092cba3
alisa@alisa-virtual-machine:~$ 


192.168.0.218:8080/demo/hello/asdad

http://192.168.0.218:8080/demo/hello/asdad


制作镜像
$ sudo docker build -t demo:latest .

查看镜像
$ sudo docker images

删除镜像
$ sudo docker rmi -f imageid

###########################################

运行容器
$ sudo docker run -d -p 8080:8080 af24cea3aaec

查看容器
$sudo docker ps

停止容器
$ sudo docker stop containerid

进入容器
$ sudo docker exec -it containerid /bin/bash

查看日志
$ sudo docker logs -f containerid

原理中最重要的一点：
    docker 守护进程会在docker镜像的最上层之上，再添加一个可读写层，容器所有的写
操作都会作用在这一层中
    copy-on-write
        aufs
            当需要写入时，将镜像层的文件拷贝一份到最上层，然后再最上层写入
            ，容器只能看到最上层的文件，所以底层的镜像不受影响
