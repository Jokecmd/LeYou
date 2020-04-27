package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface GoodsRepository extends ElasticsearchCrudRepository<Goods,Long> {

}
