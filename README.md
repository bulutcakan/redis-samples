# Redis Nedir ?
- Redis, geliştiriciler tarafından en çok kullanılan ve bilinen NoSQL veritabanlarından birisidir.
- Redis, açık kaynaktır ve kaynak kodlarına GitHub üzerinden erişilebilmektedir. 
- C dili ile yazıldığı için yüksek performanslı sonuçlar vermektedir. 
- Linux ve türevi işletim sistemleri tarafından desteklenmekte fakat Windows tarafı için resmi bir destek olmasa da community tarafından desteklenmektedir.

# Redis’in Bazı Kullanım Senaryoları
## Caching (Önbellek) Mekanizması
Sıkça kullanılan verilerimizi sürekli veritabanına ya da diğer kaynaklara gidip çağırmak yerine ön belleğe almak performans açısından olumlu bir katkı sağlayacaktır. Dağıtık mimaride çalışabilen Redis, dağıtık cache(distributed caching) yönetimi için birçok uygulamada kullanılmaktadır.

## Session Yönetimi
Uygulamalarımızı kullanırken kullanıcılara ya da diğer yapılara ait verilerimizi sayfalar arasında taşımak için session’dan sıkça yararlanmaktayız fakat uygulamamız büyüdükçe bu verilerin tutulması artan bellek alanına neden olmaktadır. Redis; sosyal medya, e-ticaret uygulamaları, oyun gibi alanlarda session bilgilerinin tutulmasında da rol almaktadır.

## Pub/Sub
Redis, pub/sub işlevini destekleyen komutlara da sahiptir ve Redis’in broadcast yayını yapmasına olanak sağlar. Bu, mesajı tek bir istemcinin bir kanala bağlı diğer birçok istemciye yayınlamasına olanak tanır.

## Queues (Kuyruklar)
Redis, gerçekleşmesi zaman alacak işleri bir kuyruk yapısına alınmasını ve daha sonradan işlenmesini destekler.


# Redis’in Avantajları
##Yüksek Performans
Redis, verileri disklerde (HDD veya SSD) tutan veri tabanlarının akside bellek (RAM) üzerinde tutar bu sayede disklere erişim ihtiyacını ortadan kaldırarak gecikmeleri, I/O bağlantılarını önler ve daha az CPU kullanan basit algoritmalar ile verilere erişir.

## In-Memory Veri Yapıları
Redis verileri bellek üzerinde <key,value> çifti olarak tutmaktadır, burada herbir anahtara denk gelen değerler farklı veri yapılarında tutulabilmektedir. Bu veri yapıları; String, List, Hash, Set, Sorted Set, Bitmaps, HyperLogLogs, Geospatial Indexes

Redis kullanılarak neredeyse her türlü veri bellekte saklanabilir.

## Replication
Redis, master-slave mimarisini kullanır, master genel olarak yazma işlemlerini yapar ve slave dediğimiz yapılar da master’in birer kopyasıdır, master güncellendikçe ona bağlı bütün slave’ler de güncellenir. Burada master’da oluşacak herhangi bir çökmede, hatada direkt bir slave master olarak seçilir ve sistem çalışmaya devam eder.

## Persistance (Veri Kalıcılığı)
Redis’te verilerin RAM üzerinde saklandığından bahsettik, olası bir elektrik kesintisi, sunucu kapanması gibi durumlarda veriler silinecektir. Redis bize iki yöntem sunmaktadır verinin kalıcılığını sağlamak için. Bunlar; point-in-time Snapshots ve Append Only File (AOF).

Snapshots yönteminde belirli zaman aralıkları ile RAM üzerindeki verinin kaydı, kopyası diske kayıt edilir bu sayede olası bir elektrik kesintisi gibi durumlarda disk üzerinden verilere tekrar geri dönülebilir.

Append Only File yönteminde ise her değişikliği dosyanın sonuna yazarak oluşan veri değişikliklerinin kaydını tutar.

## Çoklu Dil Desteği
Redis birçok dil tarafından desteklenmektedir, bunlar; Java, Python, PHP, C, C ++, C #, JavaScript, Node.js, Ruby, R, Go gibi dillerdir ve bunların yanı sıra daha fazla da dil bulunmaktadır.

## Redis Örnekleri
Spring boot üzerinde Redis implentasyonları
- 1-Spring boot ile redis i database olarak kullanma
- 2-Spring boot ile redis pub sub mantıgını kavrama 

## Redis Ayaga Kaldırma 
- 1 Compose oludugu dizine gidip docker compose up çalıştırılır
- 2 Redis CLI dan baglanmak için 
redis-cli -h 127.0.0.1 -p 6379 -a 'password' password compose içinde tanımlanır
