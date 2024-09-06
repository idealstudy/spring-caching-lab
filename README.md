## spring-caching-lab
스프링 캐싱에 관한 모든 것

# cacheManager
- 스프링에서 캐시를 관리하기 위한 추상화된 인터페이스입니다.
- 애노테이션 기반의 캐싱(@Cacheable, @CachePut, @CacheEvict)을 통해 캐시를 설정하고 관리합니다.
- 이 때 Redis를 캐시로 사용할 수 있습니다.

# redisTemplate 
- Redis의 복잡한 명령어를 자바 코드로 쉽게 사용 가능합니다.
- 다양한 데이터 타입(String, Hash, List, Set 등)을 지원하여 여러 형태의 데이터를 Redis에 저장할 수 있습니다. 그 과정에서 직렬화/역직렬화를 자동으로 처리합니다.
- Redis에서 트랜잭션을 사용할 수 있도록 돕고, 파이프라인을 통해 여러 명령어를 하나의 작업으로 처리할 수 있습니다.
