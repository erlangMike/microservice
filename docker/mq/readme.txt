一、集群
1、安装zookeeper并配置集群  查看zoo.cfg
2、安装kafka并配置zookeeper集群 查看server-*.properties

非集群

二、正常启动不用配置 用自带的zk即可


三、监控管理端
docker run --name mqManager -p 9000:9000 -d -e ZK_HOSTS="192.168.1.5:2181,192.168.1.235:2181,192.168.1.236:2181" -e APPLICATION_SECRET=letmein sheepkiller/kafka-manager
