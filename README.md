#java_study

kattsunがjavaをはじめて勉強するレポジトリ。

## 2015.07.06(月)

### 参考サイト

http://www.javadrive.jp/start/

### 概要と実行方法

#### 拡張子

(ファイル名).java

#### コンパイル(コンパイル?)

```sh
$ javac (ファイル名.java)
```

コンパイル後、(クラス名).classという名前のファイルができる。
これが実行形式のファイルだ。

#### プログラムの実行

```sh
$ java (クラス名)
```

### javaのクラス、メソッド

#### クラスとは

Javaでは何か処理をさせようとする時、その処理を行うモノを作り処理を行わせる。
目的の処理を行わせるにはそのモノがどんな機能を持っていてどんなデータを扱うのかを正しく設計する必要があるが、
作り出すモノの設計図がクラス。
つまり目的に応じたクラスを設計し、クラスからモノを作り、そのモノに処理を実行させるというのがプログラムの流れのこと。

クラスの書式は以下

```java:クラスの書式
class クラス名{

}}
```

## 2015.07.07(火)

#### メソッドとフィールド

クラスの中の記述方法の一つ。
クラスには、そのクラスから作り出されるモノが持つ機能(メソッド)とデータ(フィールド)を記述する。

```java:クラスとメソッド
class クラス名{
    フィールド1
    フィールド2
    ...
    メソッド1
    メソッド2
    ...
}
```

例えばテレビクラスがあったとする。
このクラスはテレビになり、機能であるメソッドはテレビを映すやチャンネルを変えるである。
フィールドとして、現在のチャンネル情報等がある。

#### メソッド

メソッドの書式は以下である。

```java:メソッドの書式
[修飾子] 戻り値のデータ型 メソッド名(引数1, 引数2, ...) {

}
```

データを参照してメソッドを呼び出すこともできる。

一番簡単なメソッドの構成は以下である。
引数も戻り値も無い。

```java:一番簡単なメソッドの構成
void メソッド名 () {

}
```

#### フィールド名

フィールドの書式は以下である。

```java:フィールドの書式
[修飾詞] データ型 変数名;
```

例えば以下のように記述する。
下記では、整数を扱うoldと文字列を扱うnameという変数が宣言される。

```java:フィールドの例
int old;
string name;
```

#### 最初に呼び出されるクラスのメソッド

```java:最初に呼び出されるクラスのメソッド
class クラス名{
    public static void main (String.args[]) {
        System.out.println("Hello");    
    }
}
```

このようなプログラムを書いた場合、クラスの中で最初に呼び出されるのは2行目になる。
名前がmainのメソッドをmainメソッドと言う。

#### mainメソッド

mainメソッドの書式は以下である。

```java:mainメソッドの書式
public static void main (String.args[]) {

}
```

クラスは設計図で、何か処理を行うにはクラスからモノを作り出し、
そのモノにたいしてメソッドを呼び出して実行するという流れ。
これは、mainメソッドが静的であるためである。
この静的メソッドはクラスからモノを作らなくても呼び出すことができる。
静的メソッドはstaticがつく。

#### mainメソッドが無い場合

プログラムの中で、記述したクラス名とプログラム名が異なっていた場合、
最終的にプログラムを実行した時に実行するものが無いのでエラーになる。

以下、プログラム中で記述したクラス名とファイル名が同じでも、
そのクラスの中にmainメソッドがない場合。

```java:エラーが出るコード
class errtest {
    void hello() {
        System.out.println("こん");
    }
}
```

実行時mainメソッドを呼びだそうとするが見つからないのでエラーになる。

### 書き方

#### 文の記述

javaでは、classの中にあるメソッドに、実行したい処理を記述していく。
1つのメソッドで複数の処理を実行することが可能である。
当然ながら、文の最後にセミコロンを付ける

```java:一つのメソッドに複数の処理を記述する例
class sample {
    public static void main (String.args[]) {
        System.out.println("こん");
        System.out.println("にち");
        System.out.println("は");
    }
}
```

このコードでは、3つの文が記述されていることになる。
また、文の実行手順は上側に書いてある方から実行される。

#### コメント

```java:コメント
// hoge
/* hoge */
```

#### 予約語

javaの仕様で何らかの意味を持つ単語は予約後として登録がしてある。
if等がそうである。

### エンコーディング

#### エンコーディングの確認

当然ながら、自分のエンコーディングに合わせたプログラムを作成する必要がある。
エンコーディングの確認は2015.07.07のJSample.javaでわかる。
同ディレクトリの日本語を書いたコードを実行し日本語が表示することができれば成功。(エディタの文字コードの設定に問題はない。)
UTF-8が無難かと。

#### エンコーディングを指定して実行

下記のコマンドえコンパイルすると、エンコーディングを変更してコンパイルしてくれる。

```sh
$ javac -encoding 文字コード ファイル名.java
```

UTF-8の例

```sh
$ javac -encoding UTF-8 ファイル名.java
```

### リテラル

文字リテラルや数値リテラルというふうに使われる。
文字リテラルとは、文字の値。
数値リテラルとは、数値の値と解釈する。

#### 文字

プログラム中で文字を表現する場合は、シングルクォーテーションで囲む。

```java:文字
'a'
'あ'
```

文字は一文字なので、2つ以上の文字をシングルクォーテーションで囲んではならない。

また、文字は文字コードにて表現することもできる。

#### 文字列

文字列とは、複数の連続する文字を示す。
文字列リテラルとも呼ばれる。

プログラム上で表現するときは、ダブルクオーテーションで囲む。

```java:文字
"abc"
"あいう"
```

#### 特殊な文字の入力(エスケープシーケンス)

改行等はエスケープシーケンスを用いて表現する。
例えば、こんにちはおげんきですかとあって、こんにちはとおげんきですかの間に改行を入れる。

```java:改行
System.out.println("こんにちは\nおんげんきですか");
```

下記、エスケープシーケンスの一覧である。

|   |   |
|---|---|
|\b|バックスペース|
|\t|水平タブ(タブ文字)|
|\n|改行|
|\r|復帰|
|\f|改ページ|
|\'|シングルクォーテーション|
|\"|ダブルクオーテーション|
|\\|\|
|\ooo|8進数で表示|
|\uhhh|16進数で表示|

下記サイトにも詳しくある。
http://nobuo-create.net/escape/

#### 数値

プログラム中で計算する場合は数字を扱う。
プログラム中で仕様される数値は数値リテラルと呼ぶ。

プログラム中で数値の値を記述する場合は単に数値を記述する。

```java:数値
100
3.14
```

下記のようにダブルクオーテーションで囲むと文字列になるので注意する。

```java:数値のつもりが文字列に
"1111"
```

出力の場合は下記のようになる。

```java:数値出力
System.out.println(124);
```

#### 8進数、16進数で表現する

8進数や16進数も扱えるが、そのまま出力すると自動的に10進数に変換される。

### 変数

変数はCと同じように使うことができる。
2015.07.07のJSample1_3.javaを参考にする。

#### 変数の宣言

変数は宣言を行う必要がある。
以下例である。

```java:変数宣言の例
int count;
double data;
int n1, n2, n3;
int num = 0;
```

宣言していない変数を使おうとするとエラーが生じる。

変数を使った簡単なプログラムは2015.07.07のJSample1_4.javaである。

#### 基本データ型

|   |   |
|---|---|
|boolean|true or false|
|char|16ビットUnicode文字|
|byte|8ビット整数 -128~127|
|short|16ビット整数 -32768~32767|
|int|32ビット整数 -2147483648~2147483647|
|long|64ビット整数 -9223372036854775808～9223372036854775807|
|float|32ビット単精度浮動小数点数|
|double|64ビット倍精度浮動小数点数|

注意として、javaでは1がtrue、0がfalseではありません。

#### 値の代入

変数に値を格納することを、値を代入するという。
書式は以下である。

```java:値の代入
変数 = 値;
```

```java:値代入の例
int num;
num = 10;

char c;
c = 'a';

char vv;
vv = "hoge";

int n1, n2, n3;
n1 = n2 = n3 = 0;

```

### 演算子

基本的な算術演算子はC言語と同様である。
計算の順序も同様である。

#### 単項演算子

数値の正負を逆転させるために用いる。

|   |   |   |
|---|---|---|
|演算子|使用例|意味|
|+|+a|aの正負をそのまま|
|-|-a|aの正負を反転|

#### インクリメント、デクリメント演算子

|   |   |   |
|---|---|---|
|演算子|使用例|意味|
|++|a++ or ++a|aの値を1プラスする|
|--|a-- or --a|aの値を1マイナスする|

#### ビット演算子

ビット処理については以下にある。
取り敢えずリンクだけ。

http://www.javadrive.jp/start/ope/index8.html

http://www.javadrive.jp/start/ope/index9.html

#### 代入演算子

代入演算子は以下である。

|   |   |   |
|---|---|---|
|演算子|使用例|意味|
|=|a=b|aにbを代入する|

当然、+=や-=等も利用できる。

#### 関係演算子

関係演算子も用いることができる。

|   |   |   |
|---|---|---|
|演算子|使用例|意味|
|<|a<b|aはbよりも小さい|
|>|a>b|aはbよりも大きい|
|==|a==b|aとbは等しい|
|!=|a!=b|aとbは等しくない|
|instanceof|a instanceof b|参照型変数aがbクラス/インターフェース/配列のインスタンスかどうか|

#### 論理演算子

|   |   |   |
|---|---|---|
|演算子|使用例|意味|
|&&|a&&b|aとbがともにtrueの時にtrue|
||||a||b|aかbの少なくとも1つがtrueの場合にtrue|
|!|!a|aがtrueの場合にfalse、aがfalseの場合にtrue|

#### 条件演算子

条件演算子は三項演算子と呼ばれる演算子で条件によって処理を分けることができる。
書式は以下の通りです。

```java:条件演算子の書式
条件式 ? 処理1 : 処理2
```

2015.07.07のJSamole1_5にサンプルがある。

#### 文字列の連結

文字列は連結できる。
書式は以下である。

```java:文字列連結の書式
文字列1 + 文字列2
```

下記は、目覚ましと時計を連結し、目覚まし時計と表示する。

```java:文字列連結の例
System.out.println("目覚まし" + "時計");
```

文字列と数値の連結は以下のように書ける。

```java:文字列と数値の連結1
System.out.println("200" + 9);
```

```java;mじれつと数値の連結2
System.out.println("200" + "9");
```

表示はいずれも2009になります。
文字列と数値の連結1は、左辺が文字列なので、右辺は文字列として解釈される。

数値を数値として計算し、文字列と一緒に表示する場合は以下のようになる。

```java:連結と計算
System.out.println("hoge" + (100 + 20));
```

この場合は、hoge120が表示される。

### 反復処理

繰り返し処理を用いることができる。

#### for文

for文の書式は以下である。

```java:for文
for (初期化式; 条件式; 更新) {
    処理1;
    処理2;
    ...
}
```

サンプルが2015.07.07のJSamole1_6.javaである。

for文の中で宣言した変数は、for文のブロックを抜けると使用できません。

```java:for文の注意
int a = 0;

for (int b = 0; b < 3; b++) {
    System.out.println(a);
    System.out.println(b);
}

System.out.println(a);
System.out.println(b); // ダメ
```

for文では、初期化式や変化式を複数使うこともできる。

```java:特殊なfor文
for (初期化式1, 初期化式2, ..; 更新1, 更新2, .. ) {
    処理
}
```

for文を複数使って、反復を行うこともできる。

```java:二重の反復
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        処理;
    } 
}
```

#### while文

while文の書式は以下である。

```java:while文の書式
while (条件式) {
    処理;
}
```

2015.07.07のJSample1_7.javaがサンプルである。

#### do while文

do while文の書式

```java:do while文の書式
do {
        処理;
} while (条件式);
```

2015.07.07のJSample1_8.javaがサンプルである。

#### for each文

for each文の書式

```java:for each文の書式
for (データ型 変数名: コレクション) {
    処理;
}
```

2015.07.07のJSample1_9.javaにサンプルがある。

### 条件分岐

#### if文

if文の書式

```java:if文の書式
if (条件式) {
    処理;
}
```

2015.07.07のJSamole1_10.javaにサンプルがある。

#### if else文

if else文の書式

```java:if else文の書式
if (条件式) {
    trueの時に実行する処理;
} else {
    falseの時に実行する処置;
}
```

2015.07.07のJSample1_11.javaにサンプルがある。

#### if else if文

if else if文の書式

```java:if else if文の書式
if (条件式1) {
    条件式1がtrueの時実行する処理;
} else if (条件式2) {
    条件式1がfalseで条件式2がtrueの時実行する処理;
} else {
    条件式1、条件式2のいずれもfalseの時実行する処理;
}
```

2015.07.07のJSample1_12.javaにサンプルがある。

#### switch文

switch文の書式

```java:switch文の書式
switch (式) {
    case 定数1:
        処理1;
        break;
    case 定数2:
        処理2;
        break;
}
```

2015.07.07のJSample1_13.javaにサンプルがある。
また、breakの位置をクフすると複数のcaseを処理させることができる。

### 処理の流れを処理する

#### break文

break文はfor文、while文、do while文、switch文のブロック内で使用され、break文が実行されるとブロックを抜けて次の処理へ移る。

break文の書式

```java:break文の書式
break;
```

break文が実行されるとbreak文を含む一番内側のブロックを抜けるが、ラベルを付けることで抜けるブロックを任意に指定できる。

break文にラベルを付ける場合の書式

```java:break文にラベルを付ける場合の書式
ラベル: {
    ・・・
    break ラベル;
    ・・・
}
```

2015.07.07のJSamole1_14.javaにサンプルがある。

#### continue文

continue文はbreak文と同様、for文、while文等のブロック内で使用され、continue文が実行されると実行された位置から残りの処理をスキップする

```java:continue文の書式
continue;
```

また、breakと同様にラベルを付けることもできる。


