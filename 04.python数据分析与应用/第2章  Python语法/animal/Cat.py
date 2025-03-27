class Cat:
    def __init__(self, color, name):
        self.__color = color
        self.name = name

    def speak(self):
        print('我是一直猫, ' + self.__color + ', 我叫' + self.name)

if __name__ == '__main__':
    tomcat = Cat('蓝色', 'Tom')
    tomcat.speak()
    print(tomcat.name)
    print(tomcat.__color)
