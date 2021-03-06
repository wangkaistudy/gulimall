package com.clay.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clay.gulimall.common.utils.PageUtils;
import com.clay.gulimall.product.entity.BrandEntity;
import com.clay.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author wangkai
 * @email 
 * @date 2021-02-27 23:36:54
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveDetial(CategoryBrandRelationEntity categoryBrandRelation);

    void updateCategory(Long catId, String name);

    void updateBrand(Long brandId, String brandName);

    List<BrandEntity> getBrandByCatId(Long catId);
}

