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

## Redis Örnekleri
Spring boot üzerinde Redis implentasyonları
- 1-Spring boot ile redis i database olarak kullanma
- 2-Spring boot ile redis pub sub mantıgını kavrama 

## Redis Ayaga Kaldırma 
- 1 Compose oludugu dizine gidip docker compose up çalıştırılır
- 2 Redis CLI dan baglanmak için 
redis-cli -h 127.0.0.1 -p 6379 -a 'password' password compose içinde tanımlanır
