/*
 * Copyright 2024 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.service.model.project;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

/**
 * @author yutu
 * @date 2024/05/27
 */
@Setter
@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProjectGraphDomainDataSourceVO implements Serializable {
    @Serial
    private static final long serialVersionUID = -1L;

    private String nodeId;
    private String nodeName;
    private Set<DataSource> dataSources;

    @Setter
    @Getter
    @Builder
    @ToString
    @EqualsAndHashCode
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DataSource implements Serializable {
        @Serial
        private static final long serialVersionUID = -1L;

        private String nodeId;
        private String type;
        private String dataSourceId;
        private String dataSourceName;
    }
}