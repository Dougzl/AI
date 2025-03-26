from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# 加载糖尿病数据集
diabetes = datasets.load_diabetes()
X = diabetes.data
y = diabetes.target

# 将数据集拆分为训练集和测试集
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size= 0.2)

# 创建一个多元线性回归算法对象
lr = LinearRegression()

# 使用训练集训练模型
lr.fit(X_train, y_train)

# 使用测试集进行预测
y_pred_test = lr.predict(X_test)
y_pred_train = lr.predict(X_train)

# 打印模型的均方差
print("均方误差: %.2f" % mean_squared_error(y_train, y_pred_train))
print("均方误差: %.2f" % mean_squared_error(y_test, y_pred_test))
